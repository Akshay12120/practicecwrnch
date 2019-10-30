package com.app_knit.base.views.fragments.Datasource


import com.app_knit.base.repository.models.PostCommunity

class CommunityData {
    companion object{
        fun createData(): ArrayList<PostCommunity> {
            val list = ArrayList<PostCommunity>()
            list.add(
                    PostCommunity(
                            "Equipment(Sale/Rent)efddddsdfbbffbbbddd", "Washington",
                            "New York City", "Los Angelas"
                    )
            )



            list.add(
                    PostCommunity(
                            "Crowd Funding Campaigns", "a",
                            "aa", "aa"
                    )
            )
            list.add(
                    PostCommunity(
                            "Technical Jobs", "cd",
                            "sds", "sd"
                    )
            )
            list.add(
                    PostCommunity(
                            "Auctions", "xx",
                            "dxs", "cs"
                    )
            )
            list.add(
                    PostCommunity(
                            "sc", "sc",
                            "sdf", "dscf"
                    )
            )
            list.add(
                    PostCommunity(
                            "sc", "ss",
                            "csd", "cd"
                    )
            )
            list.add(
                    PostCommunity(
                            "cd", "cs",
                            "cs", "scs"
                    )
            )
            list.add(
                    PostCommunity(
                            "swa", "cd",
                            "s", "scds"
                    )
            )
            list.add(
                    PostCommunity(
                            "as", "dc",
                            "cds", "dcf"
                    )
            )
            list.add(
                    PostCommunity(
                            "sd", "cs",
                            "scs", "scsc"
                    )
            )
            list.add(
                    PostCommunity(
                            "scs", "cs",
                            "scs", "sdc"
                    )
            )

            return list
        }
    }
    }
