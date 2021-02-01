package no.desperados.crudk.models

data class Order(val id: String,
                val items: List<Item>,
                val customer: Customer)
