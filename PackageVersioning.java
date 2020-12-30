/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

public class PackageVersioning {

    public void PackageVersioning() {
        String older = "11.1.2";
        String newer = "11.1.3";
        int iOld = 0, iNew = 0;
        StringBuilder sOlder = new StringBuilder(older);
        StringBuilder sNewer = new StringBuilder(newer);
        sOlder.append('.');
        sNewer.append('.');
        while (sNewer.indexOf(".") != -1) {
            if (Integer.parseInt(sNewer.substring(iNew, sNewer.indexOf(".")))
                    > Integer.parseInt(sOlder.substring(iOld, sOlder.indexOf(".")))) {
//                return true;
            } else if (Integer.parseInt(sNewer.substring(iNew, sNewer.indexOf(".")))
                    < Integer.parseInt(sOlder.substring(iOld, sOlder.indexOf(".")))) {
//                return false;
            }
            iOld = sOlder.indexOf(".");
            sOlder.replace(iOld, iOld + 1, "_");
            iOld++;
            iNew = sNewer.indexOf(".");
            sNewer.replace(iNew, iNew + 1, "_");
            iNew++;
        }
//      return false;
    }
}
