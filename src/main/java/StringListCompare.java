import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringListCompare {
  public static void main(String[] args) {

    // --- Expected role names (from update API) ---
    List<String> expectedRoles = Arrays.asList(
          "Self Onboard Verification", "Generate Aditya Birla Capital QR", "Apply IRCTC (Old)", "Add Payout Account",
          "Modify Two Factor Authentication", "CMF TO CMF/CSF SKU Transfer Request", "Add CSF",
          "Apply Account for ECollect", "Apply Axis CDM Request", "Apply IRCTC With AEPS", "Apply mPOS/Micro ATM",
          "Apply YesBank AEPS/DMT/BBPS", "BUY DEVICE", "Change Email/Mobile", "CSF List", "CSF SKU From CMF",
          "CSP List", "Device Remapping/Change/Lost", "Hardware Replacement", "My Agreement", "My Document",
          "Profile", "Program Letter", "Reset Pwd", "View Document", "Error Page", "Add/Modify Fraud Complaint",
          "Channel Verification", "Fraud Transaction Report", "IVR", "Add Complaint", "List Complaint",
          "Messages Templates", "Send Messages", "Home", "IRCTC BOOK DETAILS", "AEPS Velocity Report",
          "Signdesk Channel Agreement Report", "Credit Card Summary Report", "HDFC Card Detail Report",
          "Indusind Card Detail Report", "ZET APP Detail Report", "Aditya Birla QR Payout Report", "Efund Report",
          "Customer Profile Report", "Folio Details Report", "Investor Data Report", "MIS Detail Report",
          "Transaction Statement Report", "GST E-Credit Note Report", "GST E-Invoice Report", "Topin PG Report",
          "Manual Commission Report", "AEPS Request Report", "Channel Charge Invoice", "Channel Low Payout Report",
          "Cmf Dashboard", "GST Invoice", "IRCTC Report", "Kiosk Tranasction/Enrollment Report", "Ledger Report",
          "Margin Report", "PAYOUT REPORT", "SIGN-ON PAYOUT REPORT", "Sku Trail Report", "TopIn Report",
          "Transaction Report", "XPRESSO Txn Vs Non Txn Report", "Notification", "IRCTC Ticket Booking",
          "Marketing Materials", "VIDEOS", "Apply CMS Loan", "Long Term Loan", "Take CMS Limit", "PG Onboarding Charge",
          "PAY10 PG", "SBI Deposit Slip", "TopIn Request", "Apply Hardware Loan", "Axis Branch Deposit Slip",
          "Buy Amazon Coupon", "Channel GST Claim", "CMF To CSF Out", "CSF TopIn", "CSP TopIn", "Wallet Topup",
          "Xpresso Limit Request", "XPRESSO Limit Via PG/QR", "Xpresso Verification", "ONUS MARGIN SETUP"
    );

    // --- Actual roles (from getdetails API response) ---
    List<String> actualRoles = Arrays.asList(
          "Margin Setup", "Kiosk Row Data Import", "ONUS MARGIN SETUP", "Channel List", "Add CSF", "CSF List",
          "CSP List", "Self Onboard Verification", "Device/Matm", "Apply mPOS/Micro ATM", "BUY DEVICE",
          "Hardware Replacement", "Device Remapping/Change/Lost", "IRCTC", "Apply IRCTC With AEPS",
          "Apply IRCTC (Old)", "New Service", "Apply YesBank AEPS/DMT/BBPS", "Apply Axis CDM Request",
          "Apply Account for ECollect", "Add Payout Account", "Others", "Program Letter", "Profile", "Reset Pwd",
          "Profile", "My Agreement", "My Document", "Modify Two Factor Authentication", "SKU Setup",
          "CSF SKU From CMF", "CMF TO CMF/CSF SKU Transfer Request", "User Details", "Change Email/Mobile",
          "Generate Aditya Birla Capital QR", "Lending", "Apply Hardware Loan", "Wallet Topup", "Apply CMS Loan",
          "Take CMS Limit", "Long Term Loan", "Others", "Buy Amazon Coupon", "Channel GST Claim",
          "PG Onboarding Charge", "Xpresso Limit via PG/QR", "CSF TopIn", "CSP TopIn", "Xpresso Limit Request",
          "Xpresso Verification", "Axis Branch Deposit Slip", "XPRESSO Limit Via PG/QR", "SBI Deposit Slip",
          "PAY10 PG", "TopIn Request", "Topin/Topout", "CMF To CSF Out", "TRAVEL", "IRCTC Ticket Booking",
          "Add Complaint", "List Complaint", "Messages Templates", "Send Messages", "IVR",
          "Add/Modify Fraud Complaint", "Fraud Transaction Report", "Channel Verification",
          "Channel Monitoring Report", "AEPS Velocity Report", "Channel", "Channel Charge Invoice",
          "Channel Low Payout Report", "Signdesk Channel Agreement Report", "Dashboard", "Cmf Dashboard", "Kiosk",
          "Kiosk Tranasction/Enrollment Report", "PAYOUT REPORT", "SIGN-ON PAYOUT REPORT", "Loan", "Efund Report",
          "Others", "Sku Trail Report", "GST Invoice", "GST E-Invoice Report", "GST E-Credit Note Report",
          "Service", "AEPS Request Report", "Topin/Topout", "TopIn Report", "Topin PG Report", "Transaction",
          "Ledger Report", "Transaction Report", "Margin Report", "XPRESSO Txn Vs Non Txn Report",
          "Manual Commission Report", "Travel", "IRCTC Report", "Credit Card Lead", "HDFC Card Detail Report",
          "ZET APP Detail Report", "Credit Card Summary Report", "Indusind Card Detail Report", "Mutual Fund",
          "Customer Profile Report", "Transaction Statement Report", "Folio Details Report", "Investor Data Report",
          "MIS Detail Report", "Leads", "Aditya Birla QR Payout Report", "View Document", "VIDEOS",
          "Marketing Materials"
    );

    // Normalize by trimming and lowercasing
    Set<String> expectedNormalized = expectedRoles.stream()
          .map(role -> role.trim().toLowerCase())
          .collect(Collectors.toSet());

    Set<String> actualNormalized = actualRoles.stream()
          .map(role -> role.trim().toLowerCase())
          .collect(Collectors.toSet());

    // Compare sets
    Set<String> missing = new TreeSet<>(expectedNormalized);
    missing.removeAll(actualNormalized);

    Set<String> extra = new TreeSet<>(actualNormalized);
    extra.removeAll(expectedNormalized);

    // Output
    System.out.println("❌ Missing roles:");
    missing.forEach(System.out::println);

    System.out.println("\n🟡 Extra roles not expected:");
    extra.forEach(System.out::println);
  }
}
