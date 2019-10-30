package com.app_knit.base.repository.models

data class PostSocialVerse(
        var txt: String,
        var txt2: String
){
    override fun toString(): String {
        return "(title:'$txt',title2:'$txt2')"
    }

}