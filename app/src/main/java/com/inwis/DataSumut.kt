package com.inwis

object DataSumut {

    private val JudulSumut = arrayOf(
        "Taman Wisata Iman",
        "Kampung Wisata Warna Warni",
        "Kampung Wisata Lama"
    )

    private val DescSumut = arrayOf(
        "Desa Sitinjo, Kecamatan Sitinjo, Kabupaten Sidikalang/Dairi, Sumatera Utara",
        "Desa Partuko Naginjang , Kecamatan. Harian , Kabupaten Samosir.",
        "Jl.P. Naga, Denai Lama, Kecamatan. Pantai Labu, Kabupaten Deli Serdang."

    )

    private val imgSumut= intArrayOf(
        R.drawable.twi,
        R.drawable.warna_warni,
        R.drawable.wisata_lama,
    )

    val listData: ArrayList<Sumut>
        get() {
            val list = arrayListOf<Sumut>()
            for (position in JudulSumut.indices) {
                val sumut = Sumut()
                sumut.sumut = JudulSumut[position]
                sumut.desc = DescSumut [position]
                sumut.img = imgSumut[position]
                list.add(sumut)
            }
            return list
        }
}
