/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonedeal;

/**
 *
 * @author Osk
 */
public class Carrier {

    public void countCarries(Staff[] employed) {

        String[] phoneNumbers = new String[2000];

        int three = 0;
        int eir = 0;
        int vodafone = 0;
        int tesco = 0;
        int invalidNumber = 0;

        for (int i = 0; i < employed.length; i++) {

            phoneNumbers[i] = employed[i].getMobNum();

            phoneNumbers[i] = phoneNumbers[i].replace("-", "");

            phoneNumbers[i] = phoneNumbers[i].replace(" ", "");

            int condeIndex = phoneNumbers[i].length() - 8;
            int codePhone = Character.getNumericValue(phoneNumbers[i].charAt(condeIndex));

            if (codePhone == 3 || codePhone == 6) {
                three++;
            } else if (codePhone == 5) {
                eir++;
            } else if (codePhone == 7) {
                vodafone++;
            } else if (codePhone == 9) {
                tesco++;
            } else {
                invalidNumber++;
            }

        }

        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("Numbers from Three: " + three);
        System.out.println("Numbers from Eir: " + eir);
        System.out.println("Numbers from Vodafone: " + vodafone);
        System.out.println("Numbers from Tesco: " + tesco);
        System.out.println("We have " + invalidNumber + " invalid numbers in our system");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - -");
    }
}
