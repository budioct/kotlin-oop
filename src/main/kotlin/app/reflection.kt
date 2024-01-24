package app

import annotation.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException

// reflection manual
//fun validationRequest(request: CreateCategoryRequest) {
//    if (request.id == "") {
//        throw ValidationException("id is blank")
//    } else if (request.name == "") {
//        throw ValidationException("name is blank")
//    }
//}

//fun validationRequest(request: CreateProductRequest) {
//    if (request.id == "") {
//        throw ValidationException("id is blank")
//    } else if (request.name == "") {
//        throw ValidationException("name is blank")
//    }
//}

// reflection dynamic
fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("2", "")
    validateRequest(request2)
}