package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.IllegalArgumentException

fun parseInt(str:String): Int{
    try {
        // 기본 타입간의 형변환은 toType()
        return str.toInt()
    }catch (e: Exception){
        throw IllegalArgumentException("주어진 ${str}이 숫자가 아닙니다.")
    }finally {

    }
}
fun parseIntV2(str:String): Int?{
    // try-catch문도 Expression으로 처리
    return try {
        // 기본 타입간의 형변환은 toType()
        str.toInt()
    }catch (e: Exception){
        null
    }finally {

    }
}
// 코틀린에서는 checkedException과 uncheckedException을 구분하지 않는다.
// 익셉션을 굳이 신경 쓸 필요는 없다.
fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absoluteFile , "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// 코틀린에서 try with resources구문이 없다.
fun readFile2(path: String){
    // 람다, 코틀린의 특성
    // use라는 인라인 확장 함수 -> 함수형 프로그래밍의 핵심
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}



