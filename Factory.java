public class Factory {
    public PasswCracker getInstance(int choice) {
        switch (choice) {
            case 0:
                return new Dictionary();
            default:
                return new BfCrack();
        }
    }
}
