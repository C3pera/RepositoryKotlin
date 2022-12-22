class SwordRepository(){
    private var swords = mutableListOf<Sword>()

    fun insert(sword: Sword) = swords.add(sword)
    fun delete(sword: Sword) = swords.remove(sword)
    fun deleteById(id : Int) = swords.removeAt(id)
    fun findById(id : Int) : Sword? = swords.find { it.id == id }

    fun printAll(){
        println(swords)
    }
}