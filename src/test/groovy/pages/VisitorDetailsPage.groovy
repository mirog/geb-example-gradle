package pages

import geb.Page

class VisitorDetailsPage extends Page {
    static at = { title == "Visitor details" }

    static content = {
        deleteVisitorButton { $('.delete-visitor-button', 0) }
        listingButton { $('.listing-button', 0) }
    }

}
