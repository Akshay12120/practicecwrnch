package com.app_knit.base.repository.models

data class PostCommunity(
        var text1: String,
        var text2: String,
        var text3: String,
        var text4: String
){
    override fun toString(): String {
        return "(title='$text1', title2='$text2','title3='$text3,'title4='$text4)"
    }
}