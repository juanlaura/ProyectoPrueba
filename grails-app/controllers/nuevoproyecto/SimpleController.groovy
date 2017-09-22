package nuevoproyecto

import grails.converters.JSON

class SimpleController {

    def index() {
        def myMap = [nombre: "Juan", apellido: "Laura"]

        render myMap as JSON
    }
}
