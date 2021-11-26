package com.example.cleanarchitecturenoteapptheme.feature_note.presentation.add_edit_note

import androidx.compose.animation.Animatable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun AddEditNoteEvent(
    navController: NavController,
    noteColor: Int,
    viewModel: AddEditViewModel = hiltViewModel(),
){
    val titleState = viewModel.noteTitle.value
    val contentState = viewModel.noteContent.value
    
    val scaffoldState = rememberScrollState()
    val noteBackgroundAnimate = remember {
        Animatable(
            Color(if(noteColor != -1) noteColor else viewModel.noteColor.value)
        )
    }
    val scope = rememberCoroutineScope()
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                
            }
        }
    ) {
        
    }
    
}