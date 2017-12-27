package hashtable;

public class SomeFakeObjectReturnsFixedHashCode {

    private final int hashCode;

    public SomeFakeObjectReturnsFixedHashCode(final int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }
}
