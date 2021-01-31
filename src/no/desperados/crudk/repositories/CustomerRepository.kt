package no.desperados.crudk.repositories

import no.desperados.crudk.models.Customer

class CustomerRepository {
    fun getCustomer(id: Int): Customer? {
        println("Retrieving customer with id $id")
        return null
    }

    fun createCustomer(newCustomer: Customer): Customer {
        println("Saving new customer...")
        return newCustomer
    }
}