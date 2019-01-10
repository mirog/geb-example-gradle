package pages

import geb.Page
import modules.VisitorListModule

class VisitorListingPage extends Page {
    static url = '/'

    static at = { title == "Visitor listing" }

    static content = {
        noContent(required: false) { $('.no-content', 0) }
        visitorList(required: false) { $('.visitor-list', 0).module(VisitorListModule) }
        addVisitor { $('.add-visitor-button', 0) }
    }
}
