package com.minimaltv.launcher

object MovieList {
    val MOVIE_CATEGORY = arrayOf(
        "Category Zero",
        "Category One",
        "Category Two",
        "Category Three",
        "Category Four",
        "Category Five"
    )

    val list: List<Movie> by lazy {
        setupMovies()
    }
    private var count: Long = 0

    private fun setupMovies(): List<Movie> {
        val bunnyPoster = "https://media.w3.org/2010/05/bunny/poster.png"
        val sintelPoster = "https://media.w3.org/2010/05/sintel/poster.png"
        val testPoster = "https://media.w3.org/2010/05/video/poster.png"

        return listOf(
            movie("Big Buck Bunny", "A cheerful rabbit faces a band of forest hunters in this open Blender short.", "Blender Open Movies", "https://media.w3.org/2010/05/bunny/movie.mp4", bunnyPoster),
            movie("Big Buck Bunny Trailer", "A short preview of Big Buck Bunny, a freely available open movie test stream.", "Blender Open Movies", "https://media.w3.org/2010/05/bunny/trailer.mp4", bunnyPoster),
            movie("Sintel Trailer", "A young woman searches for her lost dragon companion in this open animated short.", "Blender Open Movies", "https://media.w3.org/2010/05/sintel/trailer.mp4", sintelPoster),
            movie("W3C MPEG-4 Test Clip", "A compact MPEG-4 sample for testing Android TV video loading and seeking.", "W3C Media Tests", "https://media.w3.org/2010/05/video/movie_300.mp4", testPoster),
            movie("W3C WebM Test Clip", "A compact WebM sample for testing an alternate TV-compatible video format.", "W3C Media Tests", "https://media.w3.org/2010/05/video/movie_300.webm", testPoster)
        )
    }

    private fun movie(
        title: String,
        description: String,
        studio: String,
        videoUrl: String,
        posterUrl: String
    ): Movie = Movie(
        id = count++,
        title = title,
        description = description,
        studio = studio,
        videoUrl = videoUrl,
        cardImageUrl = posterUrl,
        backgroundImageUrl = posterUrl
    )
}
