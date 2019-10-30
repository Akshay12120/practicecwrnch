package com.app_knit.base.views.fragments.Datasource

import com.app_knit.base.repository.models.PostSocialVerse

class SocialverseData{
    companion object{
        fun dataset(): ArrayList<PostSocialVerse> {
            val list = ArrayList<PostSocialVerse>()
            list.add(
                    PostSocialVerse("John Smith has commented in Technical jobs","11:30PM 5 Jan")

            )
            list.add(
                    PostSocialVerse("Samantha has messaged you","11:30PM 5 Jan")

            )
            list.add(
                    PostSocialVerse("John Smith has commented in Technical jobs","11:30PM 5 Jan")

            )
            list.add(
                    PostSocialVerse("Alex has commented in Maryland","11:30PM 5 Jan")

            )
            list.add(
                    PostSocialVerse("John Smith has commented in Technical jobs","11:30PM 5 Jan")

            )
            return list
        }

    }
}