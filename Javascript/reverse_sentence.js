const inputSentence = "This is a sunny day";
console.log('INPUT SENTENCE :', inputSentence);
const reverseSentenceOutput = reverseSentence(inputSentence);
console.log('SENTENCE AFTER REVERSE :', reverseSentenceOutput);

function reverseSentence(sentence) {
    const wordsArr = sentence.split(' ');
    let reversedSentence = '';

    for (let i = 0; i < wordsArr.length; i++) {
        const word = wordsArr[i];
        const reversedWord = reverseWord(word);

        if (i > 0) {
            reversedSentence += ' ';
        }

        reversedSentence += reversedWord;
    }

    return reversedSentence;
}

function reverseWord(word) {
    let reversedWord = '';

    for (let i = word.length - 1; i >= 0; i--) {
        reversedWord += word[i];
    }

    return reversedWord;
}