package no.desperados.crudk.routes

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import no.desperados.crudk.models.Customer

fun Application.customerRoutes() {
    routing {
        route("/customer") {
            get("/{id}") {
                println("Fetching customer...")
                val fetchedCustomer = Customer("1", "Jenna")
                println("Fetched customer: $fetchedCustomer")
                call.respond(fetchedCustomer)
            }

            post("/?") {
                val newCustomer = Customer("2", "Arthur")
                println("Created customer: $newCustomer")
                call.respond(newCustomer)
            }
        }
    }
}
