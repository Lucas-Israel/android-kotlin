package com.betrybe.properties

// declaração de propriedades
class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

// acessando as propriedades
fun copyAddress(address: Address): Address {
    val result = Address() // não existe a palavra chave 'new' no Kotlin
    result.name = address.name // propriedades são acessadas
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip

    return result
}

// getter e setter
class Rectangle {
    private var width: Int = 0
        get() = field
        set(value) {
            field = value
        }

    private var height: Int = 0
        get() = field
        set(value) {
            field = value
        }

    val area get() = this.width * this.height

}