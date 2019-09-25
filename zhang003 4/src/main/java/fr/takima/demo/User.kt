package fr.takima.demo

import javax.persistence.*

/**
 *
 */
@Entity(name = "users")
data class User(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id var id: Long?,
        @Column(name ="animal") var animal: String?,
        @Column(name ="amount") var amount: Int?,
        @Column(name ="food") var food: String?,
        @Column(name ="stock") var stock: Int?,
        @Column(name ="source") var source: String?){
    constructor() : this(null,null,null,null,null,null)
}



