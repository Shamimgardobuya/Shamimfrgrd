fun main(){
    var somebody =Mobile("cameraPhone","Samsung",656)
    somebody.record()
    println(somebody.Model)
    println(somebody.Brand)
    println(somebody.MRP)
    var pink = Lady("Asha","Simpson",23)
    pink.laugh()
    println(pink.firstName)
    println(pink.lastName)
    println(pink.age)
    var yes = employee("Mwai","sky435gard@gmail.com","Sky")
    yes.write()
    println(yes.name)
    println(yes.email)
    println(yes.company)
    val array = intArrayOf(1,2,3,4,5)
    for (item in array)
        println(item.toString())
    addNum(3,7)

}
class Mobile(var  Model:String,var Brand:String,var MRP:Int){
    fun record(){
        println("tttt")

    }



}
class Lady(var firstName:String,var lastName:String,var age:Int){
    fun laugh(){

    }
}
class employee(var name :String,var email:String,var company:String) {
    fun write() {
        //    var result =name.contentto string
        // println()

    }
}
fun addNum(a:Int,b:Int){
    var sum1 = a+b
    println(sum1)
}
