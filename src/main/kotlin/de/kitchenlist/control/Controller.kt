package de.kitchenlist.control

import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.ObservableList
import de.kitchenlist.model.Log
import de.kitchenlist.model.Person
import de.kitchenlist.model.Product

data class Controller(val persons: ObservableList<Person>,
					  val products: ObservableList<Product>,
					  val log: Log) {

	var isLoggedIn = SimpleBooleanProperty(false)

	fun createPerson(firstName: String, lastName: String) {
		val person = Person(SimpleStringProperty(firstName), SimpleStringProperty(lastName))
		persons += person

		log.append("Neue Person erstellt! Nachname: $lastName, Vorname: $firstName")
		person.log.append("Erstellung!")
	}
}
