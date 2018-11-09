<template>
  <div class="container">
    <div class="input-area">
      <input id="regex-input" class="regex-input" type="text" v-model="input" @keypress="keyPress($event)">
      <button class="submit" @click="fetchWords()">Search</button>
    </div>
    <div class="result">
      <table>
        <tr v-for="row in words.length / 4" :key="row">

        </tr>
      </table>
    </div>
  </div>
</template>

<script>
const API = 'http://api.words-back.cfapps.io'

export default {
  data() {
    return {
      input: 'word.*',
      words: []
    }
  },
  mounted() {
    document.getElementById('regex-input').focus();
  },
  methods: {
    keyPress(event) {
      if (event.key === "Enter")
        this.fetchWords();
    },
    fetchWords() {
      fetch(API + '/words?regex=' + new RegExp(this.input)).then(resp => {
        resp.json().then(resp => {
          this.words = resp;
        })
      });
    }
  }
}
</script>

<style>
.container {
  max-width: 400px;
  margin: auto;
}
.regex-input {
  font-family: 'Courier New', Courier, monospace;
  width: 100%;
}
.submit {
  margin-left: 1rem;
}
.input-area {
  display: flex;
  
}
</style>

