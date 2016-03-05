package ssta.pe;

/**
 * Created by ssta on 06/12/15.
 */
public class Main {
  public static void main(String[] args) {
    String s = "AcademicSession.AcadSessActionValue=UCRecord/UndergraduateAdmissionsRecord/AdmissionsApplication/Applicant/SelfReportedAcademicRecord/AcademicSession/@action";
    String[] s2 = s.split("=");
    System.out.println(s2.length);
    System.out.println(s2[0]);
    String[] s3 = s2[0].split("\\.");
    System.out.println(s3.length);
    //line.setTable(s3[0]);
    //line.setField(s3[1]);
  }
}
