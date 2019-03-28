# Language-models-and-smoothing
You will train a unigram, bigram and trigram model on a training corpus and then test the three models on a testing corpus.

Training and test data: We have one training corpus that consists of Shakespeare’s comedy
plays and a test corpus that consists of Shakespeare’s historical plays. All texts include some
tags that are marked with <*> for the beginning of the text and </*> for the end of the text.
You need to take out all the tags in order to have the real text for both training and testing.
You may use regular expressions for this task. You also need to separate punctuation marks
by whitespaces in order to take those as also tokens.
Smoothing Use add-one smoothing to smooth the models for zero probabilities.
