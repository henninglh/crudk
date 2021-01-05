package no.desperados.crudk.repositories

import no.desperados.crudk.models.Customer

class CustomerRepository {
    fun getCustomer(id: Int): Customer? {
        return null
    }

    fun createCustomer(newCustomer: Customer): Customer {
        println("Saving new customer...")
        return newCustomer
    }
}