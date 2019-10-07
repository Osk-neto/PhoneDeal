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
public class PhoneDeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Staff[] employed = new Staff[2000];
        SetUp setup = new SetUp();

        employed = setup.buildTHem(employed);

        for (int i = 0; i < employed.length; i++) {
            System.out.println(employed[i]);
        }
        Carrier cari = new Carrier();
        cari.countCarries(employed);

    }

}
