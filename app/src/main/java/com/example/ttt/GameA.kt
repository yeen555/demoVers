package com.example.ttt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ttt.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    private val board: Array<Array<String>> = Array(3) { Array(3) { "" } }
    private val symX = "X"
    private val symO = "O"
    private var i : Int = 0
    private var j : Int = 0

    private var rand = {
        i = (0..2).random()
        j = (0..2).random()
    }

    private fun showSym() {
        if (board[0][0]==symO) {
            binding.run { gameB00.setImageResource(R.drawable.oicon) }
        }
        if (board[0][1]==symO) {binding.gameB01.setImageResource(R.drawable.oicon)}
        if (board[0][2]==symO) {binding.gameB02.setImageResource(R.drawable.oicon)}
        if (board[1][0]==symO) {binding.gameB10.setImageResource(R.drawable.oicon)}
        if (board[1][1]==symO) {binding.gameB11.setImageResource(R.drawable.oicon)}
        if (board[1][2]==symO) {binding.gameB12.setImageResource(R.drawable.oicon)}
        if (board[2][0]==symO) {binding.gameB20.setImageResource(R.drawable.oicon)}
        if (board[2][1]==symO) {binding.gameB21.setImageResource(R.drawable.oicon)}
        if (board[2][2]==symO) {binding.gameB22.setImageResource(R.drawable.oicon)}
    }

    private fun botMove() {
        rand()
        if (board[i][j] == symX || board[i][j] == symO) {
            botMove()
        }
        board[i][j] = symO
        showSym()
        onStart()
    }





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gameB00.setOnClickListener {
            board[0][0] = symX
            binding.gameB00.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB01.setOnClickListener {

            board[0][1] = symX
            binding.gameB01.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB02.setOnClickListener {
            board[0][2] = symX
            binding.gameB02.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB10.setOnClickListener {

            board[1][0] = symX
            binding.gameB10.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB11.setOnClickListener {
            board[1][1] = symX
            binding.gameB11.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB12.setOnClickListener {
            board[1][2] = symX
            binding.gameB12.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB20.setOnClickListener {
            board[2][0] = symX
            binding.gameB20.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB21.setOnClickListener {
            board[2][1] = symX
            binding.gameB21.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }

        binding.gameB22.setOnClickListener {
            board[2][2] = symX
            binding.gameB22.setImageResource(R.drawable.xicon)
            botMove()
            winCond()
        }
        binding.backMainA.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }

    private fun winCond() {
        TODO("Not yet implemented")
    }
}
