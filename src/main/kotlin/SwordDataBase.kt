class SwordDataBase(){
    var swords = mutableListOf<Sword>()

    fun insertToList(sword : Sword) = swords.add(sword)
    fun findById(id : Int) : Sword? = swords.find { it.id == id }
    fun delete(sword: Sword) = swords.remove(sword)
    fun deleteById(id : Int) = swords.removeAt(id)
}