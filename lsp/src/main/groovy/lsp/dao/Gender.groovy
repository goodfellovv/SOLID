package lsp.dao

enum Gender {
    MALE(0), FEMALE(1), OTHER(2)

    private final int value

    Gender(int value) {
        this.value = value
    }

    int getValue() {
        value
    }
}