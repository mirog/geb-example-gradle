package modules

import geb.Module

class VisitorListModule extends Module {
    static content = {
        links { $("a") }
    }
}
