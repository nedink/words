<template>
  <div id="app">
    <words/>
  </div>
</template>

<script>
import Words from './components/Words.vue';

export default {
  name: 'app',
  components: {
    Words
  }
}
</script>

<style>
* {
  box-sizing: border-box;
  color: var(--text-color);
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
}
:root {
  
  /* VARS ----------------------------------------- */
  --background-color: #2c3e50;
  --background-color-darker: #1f252b;
  --text-color: #cdcfe0;
  --text-color-lighter: #f1f1f7;
  --highlight-color: #00ff4c80;
  --border-radius: 6px;
  /* ---------------------------------------------- */
  
  background-color: var(--background-color);
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  margin-top: 60px;
}
*:focus {
  transition-duration: 100ms;
  box-shadow: 0 0 0 4px var(--highlight-color);
  color: var(--text-color-lighter);
}
*:hover {
  color: var(--text-color-lighter);
}
input {
  font-size: 1rem;
  font-weight: 400;
  background-color: var(--background-color-darker);
  color: var(--text-color-lighter);
  border: none;
  border-radius: var(--border-radius);
  outline: none;
  height: 38px;
  padding: 0.5rem 0.75rem;
}
button {
  font-size: 1rem;
  background-color: var(--background-color-darker);
  border: none;
  border-radius: var(--border-radius);
  outline: none;
  cursor: pointer;
  height: 38px;
  padding: 0.5rem 1.5rem;
}
button:hover {
}
#app {

}
</style>
