<template>
  <navs></navs>
</template>

<script>
// @ is an alias to /src
import navs from "../components/nav.vue"
import footer from "../components/footer.vue"

export default {
  name: 'Home',
  components: {
    navs,
    footer
  }
}
</script>
