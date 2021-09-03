package lsp.dao

class Laborer extends PublicPerson implements Person {

    Laborer() {
        super()
    }

    @Override
    String whoAmI() {
        return "I am Just Laborer"
    }
}
