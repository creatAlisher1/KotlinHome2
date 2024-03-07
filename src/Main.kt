fun main(){
println(vae(25, 78.0))
println(vae(2, 98.0))
println(vae(5, 15.0))
println(vae(259, 38.0))
println(vae(245, 68.0))
println(vae(75, 10.0))
}

fun vae(age: Int, asdf: Double): String {
    if (age in 20..45 && asdf in -20.0..30.0) {
        return "Можно идти гулять"
    }
    if (age < 20 && asdf in 0.0..28.0) {
        return "Можно идти гулять"
    }
    if (age > 40 && asdf in -10.0..25.0) {
        return "Можно идти гулять"
    } else {
        return "оставайся дома"
    }
}