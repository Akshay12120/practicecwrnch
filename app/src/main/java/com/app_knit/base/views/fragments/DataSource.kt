package com.app_knit.base.views.fragments

import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost


class DataSource {
    companion object {
        fun createDataset(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                    BlogPost(
                            "Technical jobs", "https://wellnessdev.s3.us-east-2.amazonaws.com/development/images/best/symptom/977460066904524",
                            "Participants 5"
                    )
            )
            list.add(
                    BlogPost(
                            "Auctions", "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_.jpg",
                            "Participants 5"
                    )
            )
            list.add(
                    BlogPost(
                            "Equipment", "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_.jpg",
                            "Participants 5"
                    )
            )
            list.add(
                    BlogPost(
                            "Technical jobs", "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_.jpg",
                            "Participants 5"
                    )
            )

            return list
        }
    }
}