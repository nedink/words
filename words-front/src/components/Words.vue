<template>
  <div class="container">
    <div class="input-area">
      <input class="regex-input" type="text" v-model="input">
      <button class="submit">Search</button>
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
const BACKEND = 'https://api.words-back.cfapps.io'

export default {
  data() {
    return {
      input: 'word.*',
      words: []
    }
  },
  mounted() {

  },
  methods: {
    fetchWords() {
      fetch(BACKEND + '/words?regex=' + new RegExp(this.input))
      this.words = null;
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

