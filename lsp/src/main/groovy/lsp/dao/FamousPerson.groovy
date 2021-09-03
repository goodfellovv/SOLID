package lsp.dao

class FamousPerson extends PublicPerson {

    FamousPerson() {
        super()
    }

    @Override
    String whoAmI() {
        return "I am Famous Person!"
    }
}
