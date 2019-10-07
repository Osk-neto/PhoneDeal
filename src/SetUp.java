/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonedeal;

import java.util.Random;

/**
 *
 * @author Osk
 */
public class SetUp {

    String[] names = {"Billy", "bob", "dave", "jane", "mary", "joe", "chris"};

    String[] mobs = {"083", "085", "086", "087", "089", "+353", "83", "86", "85", "87", "89"};

    String[] addOn = {"1234567", "123456", " - 1234567", " 1234567", "-1234567"};

    Random rGen = new Random();

    public Staff[] buildTHem(Staff[] Employed) {
        for (int i = 0; i < Employed.length; i++) {

            Employed[i] = new Staff();

            Employed[i].setName(names[rGen.nextInt(names.length)]);
            Employed[i].setMobNum(mobs[rGen.nextInt(mobs.length)]+addOn[rGen.nextInt(addOn.length)]);
            
         //System.out.println(Employed[i].toString());
        }
        return Employed;
    }
}
