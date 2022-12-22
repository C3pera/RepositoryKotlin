fun main() {
    val swordRepository = SwordRepository()

    swordRepository.insert(Sword(1, "Murasama", "Steel", 99))
    swordRepository.printAll()
    println(swordRepository.findById(-1))
}