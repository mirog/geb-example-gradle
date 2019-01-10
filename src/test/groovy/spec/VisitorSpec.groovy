package spec

import geb.spock.GebSpec
import pages.VisitorCreationPage
import pages.VisitorDetailsPage
import pages.VisitorListingPage

class VisitorSpec extends GebSpec {

    def "should show empty listing"() {
        when:
        to VisitorListingPage

        then:
        noContent.displayed
        !visitorList.displayed

        and:
        addVisitor.click()

        then:
        at VisitorCreationPage

        and:
        listingButton.click()

        then:
        at VisitorListingPage
    }

    def "should create a new visitor"() {
        when:
        to VisitorListingPage

        and:
        addVisitor.click()

        then:
        at VisitorCreationPage

        when:
        firstNameField = 'Anna'
        lastNameField = 'Nowak'

        createVisitorButton.click()

        then:
        at VisitorListingPage

        and:
        !noContent.displayed
        visitorList.displayed

        when:
        visitorList.links[0].click()

        then:
        at VisitorDetailsPage

        and:
        deleteVisitorButton.click()

        then:
        at VisitorListingPage
    }
}