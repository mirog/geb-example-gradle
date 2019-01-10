package pages

import geb.Page

class VisitorCreationPage extends Page {
    static at = { title == "Visitor creation" }

    static content = {
        firstNameField { $("#firstName") }
        lastNameField { $("#lastName") }
        listingButton { $('.listing-button', 0) }
        createVisitorButton { $('.create-visitor-button', 0) }
    }

}
