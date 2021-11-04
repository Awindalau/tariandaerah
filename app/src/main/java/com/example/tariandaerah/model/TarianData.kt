package com.example.tariandaerah.model

import com.example.tariandaerah.R

object TarianData {
    private val speciesName = arrayOf(
        "Tari Bidu",
        "Tari Gambyong",
        "Tari Gending Sriwijaya",
        "Tari Jaipong",
        "Tari Pendet",
        "Tari Piring",
        "Tari Remo",
        "Tari Reog Ponorogo",
        "Tari Saman"
    )

    private val speciesDesc = arrayOf(
        "Tari Bidu adalah salah satu tarian tradisional dari daerah Belu, Nusa Tenggara Timur (NTT). Tarian ini biasanya ditampilkan oleh beberapa penari pria dan penari wanita berbusana adat dan menari dengan gerakan yang sangat khas. Tari Bidu merupakan salah satu tarian tradisional yang cukup terkenal di masyarakat Belu. Konon, Tarian ini dulunya digunakan oleh masyarakat di sana sebagai media pencarian jodoh bagi para pemuda dan pemudi.",
        "Gambyong merupakan salah satu bentuk tarian Jawa klasik yang berasal-mula dari wilayah Surakarta dan biasanya dibawakan untuk pertunjukan atau menyambut tamu. Gambyong bukanlah satu tarian saja melainkan terdiri dari bermacam-macam koreografi, yang paling dikenal adalah Tari Gambyong Pareanom (dengan beberapa variasi) dan Tari Gambyong Pangkur (dengan beberapa variasi)",
        "Tari Gending Sriwijaya merupakan tari yang melukiskan kegembiraan gadis-gadis Palembang saat menerima tamu yang diagungkan. Tepak yang berisi kapur, sirih, pinang dan ramuan lainnya dipersembahkan sebagai ungkapan rasa bahagia, Tari Gending Sriwijaya diiringi Gamelan dan lagu Gending Sriwijaya.\n" +
                "Tari Gending Sriwijaya pertama kali dipentaskan dimuka umum pada tanggal 2 Agustus 1945, di halaman Masjid Agung Palembang, yaitu ketika pelaksanaan upacara penyambutan kedatangan M. Syafei Ketua Sumatora Tyuo In ( Dewan Perwakilan Rakyat Sumatra) dan Djamaluddin Adinegoro (Ketua Dewan Harian Sumatera ). Pada saat pergelaran tari Gending Sriwijaya pertama kali digelar dan dibawakan oleh 9 penari antara lain : Siti Nuraini, Rogayah H, Delima A. Rozak, Thfah, Halimah, Busron, Darni, Emma dan Tuti Zahara.\n" +
                "Tarian yang khas ini mencerminkan sikap tuan rumah yang ramah, gembira dan bahagia, tulus dan terbuka terhadap tamu yang istimewa itu. Tarian digelarkan 9 penari muda dan cantik-cantik yang berbusana Adat Aesan Gede, Selendang Mantri, paksangkong, Dodot dan Tanggai.\n" +
                "Mereka merupakan penari inti yang dikawal dua penari lainnya membawa payung dan tombak. Sedang di belakang sekali adalah penyanyi Gending Sriwijaya. Namun saat ini peran penyanyi dan musik pengiring ini sudah lebih banyak digantikan tape recorder. Dalam bentuk aslinya musik pengiring ini terdiri dari gamelan dan gong. Sedang peran pengawal terkadang ditiadakan, terutama apabila tarian itu dipertunjukkan dalam gedung atau panggung tertutup. Penari paling depan membawa tepak sebagai Sekapur Sirih untuk dipersembahkan kepada tamu istimewa yang datang, diiringi dua penari yang membawa pridon terbuat dari kuningan. Persembahan Sekapur Sirih ini menurut aslinya dilakukan oleh putri saja. Sultan atau bangsawan.\n",
        "Tari jaipong adalah sebuah tari daerah yang berasal dari Karawang, Jawa Barat yang berkembang pada tahun 60-an. Mulanya tari jaipong dikenal dengan sebutan tari Banjet, sebuah pertunjukan seni tari yang yang dipentaskan dengan gerakan tari yang diiringi oleh musik dengan instrumen gamelan sebagai pengiringnya. Tari ini dahulu dijadikan sebagai hiburan rakyat, tari jaipong merupakan sebuah inovasi yang dilakukan oleh seorang seniman asal Karawang, tari ini merupakan gabungan dari pencak silat, wayang golek, topeng banjet, ketuk tilu, tarling, dan tepak topeng.",
        "Tari Pendet pada awalnya merupakan tari pemujaan yang banyak diperagakan di pura, tempat ibadah umat Hindu di Bali, Indonesia. Tarian ini melambangkan penyambutan atas turunnya dewata ke alam dunia. Lambat-laun, seiring perkembangan zaman, para seniman Bali mengubah Pendet menjadi \"ucapan selamat datang\", meski tetap mengandung anasir yang sakral-religius.",
        "Tari piring adalah tarian adat yang berasal dari Minangkabau, tepatnya dari Solok, Sumatera barat. Diperkirakan tarian ini telah ada sejak 800 tahun yang lalu. Pada zaman dahulu, tarian ini dilakukan sebagai ritual ucapan syukur kepada para dewa atas berkah hasil panen yang melimpah.",
        "Tari Remo adalah salah satu tarian untuk penyambutan tamu yang ditampilkan baik oleh satu atau lebih.Tarian ini sebenarnya menceritakan tentang perjuangan seorang pangeran dalam medan laga. Akan tetapi dalam perkembangannya tarian ini menjadi lebih garang ditarikan oleh perempuan, sehingga memunculkan gaya tarian yang lain: Remo Putri atau Tari Remo gaya perempuan dan banci.",
        "Reog Ponorogo merupakan salah satu kesenian tradisional Jawa Timur. Salah satu seni pertunjukkan yang kentalm dengan hal-hal yang berbau mistis dan juga ilmu kebatinan yang diketahui berasal dari Kabupaten Ponorogo. Oleh karena itu lebih populer dengan sebutan Reog Ponorogo.",
        "Tari Saman adalah sebuah tarian Suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat. Syair dalam tarian saman mempergunakan Bahasa Gayo. Selain itu biasanya tarian ini juga ditampilkan untuk merayakan kelahiran Nabi Muhammad SAW."



    )
    private val speciesImage = arrayOf(
        R.drawable.bidu,
        R.drawable.gambyong,
        R.drawable.gending,
        R.drawable.jaipong,
        R.drawable.pendet,
        R.drawable.piring,
        R.drawable.remo,
        R.drawable.reog,
        R.drawable.saman
    )

    val listTarian : ArrayList<Tarian>
        get() {
            val list = arrayListOf<Tarian>()
            for (position in speciesName.indices){
                val tarian = Tarian()
                 tarian.namaTarian= speciesName[position]
                tarian.descTarian = speciesDesc[position]
                tarian.gambarTarian = speciesImage[position]
                list.add(tarian)
            }
            return list
        }

}