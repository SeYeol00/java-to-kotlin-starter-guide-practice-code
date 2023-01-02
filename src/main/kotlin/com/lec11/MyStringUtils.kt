package com.lec11


class MyStringUtils{
    // 코틀린은 직접 파일에 유틸성 코드를 작성해서 사용하는게 훨씬 편하다.
    private fun isDirectoryPath(path: String): Boolean{
        return path.endsWith("/")
    }
}