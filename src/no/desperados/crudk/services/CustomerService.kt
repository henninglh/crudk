package no.desperados.crudk.services

import no.desperados.crudk.models.Customer

class CustomerService {
    fun getCustomer(id: Int): Customer? {
        // TODO: get customer from database
        return when (id) {
            1 -> Customer(1, "Jenna")
            2 -> Customer(2, "James")
            else -> null
        }
    }

    fun createCustomer(newCustomer: Customer): Customer {
        // TODO: save customer in database
        return newCustomer
    }
}