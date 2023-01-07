package com.inwis

object DataKampungWisata {

    private val JudulKampungWisata = arrayOf(
        "Sumatera Utara",
        "Sumatera Barat",
        "Bali ",
        "Aceh",
        "Daerah Istimewa Yogyakarta "
    )

    private val imgKampungWisata = intArrayOf(
        R.drawable.sumut,
        R.drawable.sumbar,
        R.drawable.bali,
        R.drawable.aceh,
        R.drawable.yogyakarta
    )

    val listData: ArrayList<KampungWisata>
        get() {
            val list = arrayListOf<KampungWisata>()
            for (position in JudulKampungWisata.indices) {
                val kampungWisata = KampungWisata()
                kampungWisata.kampung_wisata = JudulKampungWisata[position]
                kampungWisata.img = imgKampungWisata[position]
                list.add(kampungWisata)
            }
            return list
        }

}
