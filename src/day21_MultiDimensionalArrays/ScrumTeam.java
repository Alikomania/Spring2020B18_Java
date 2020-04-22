package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        // index number =>      0         1         2        3
        String[] DevTeam = { "Zeynep", "Haider", "Jovid", "Muhtar" };
        String[] TestersTeam = { "Rahman", "Aishan", "Osman", "Ali"};

        String[] PO = {"Barzy", "Donald"};

        String[] TestersTeam2 = {"Ilhan", "Zarina", "Aizhan", "Asiman"};

        String[][] ScrumTeam = {DevTeam, TestersTeam, PO};
        // index number =>          0   ,      1       2

        ScrumTeam[0][3] = "Jean"; // Re-assign instead of "Muhtar"
        System.out.println(ScrumTeam[0][3]); // Jean

        ScrumTeam[1] = TestersTeam2; // Re-assign instead of TestersTeam

        String info = ScrumTeam[1][2];
        System.out.println(info); // Aizhan

        System.out.println("=============================================");

        for (String eachDev : ScrumTeam[0]){
            System.out.println(eachDev);
        }
        for (String eachTester : ScrumTeam[1]){
            System.out.println(eachTester);
        }
        System.out.println("=============================================");

        System.out.println(ScrumTeam[2][1]); // Donald

        System.out.println("=============================================");







    }
}
