package com.example.recipekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddRecipe.setOnClickListener {
            binding.txtViewRecipeArea.text = binding.txtViewRecipeArea.text.toString().plus("Recipe name: \n${binding.edtRecipeName.text}\n")
            binding.edtRecipeName.text.clear()
        }

        binding.btnAddIngredients.setOnClickListener {
            binding.txtViewRecipeArea.text = binding.txtViewRecipeArea.text.toString().plus("Ingredients: \n${binding.edtIngredients.text}\n")
            binding.edtIngredients.text.clear()
        }

        binding.btnAddInstruction.setOnClickListener {
            binding.txtViewRecipeArea.text = binding.txtViewRecipeArea.text.toString().plus("Instructions: \n${binding.edtInstructions.text}\n\n")
            binding.edtInstructions.text.clear()
        }

        binding.btnClear.setOnClickListener {
            binding.txtViewRecipeArea.text = ""
        }

    }

}