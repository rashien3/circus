<<<<<<< HEAD:src/main/java/circus/stuff/Equipment.java
package circus.stuff;

import circus.Asset;

=======
>>>>>>> 2d109e71ee0a22922ccdc5d6cc83f47c858ad5c3:src/main/java/Equipment.java
public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
