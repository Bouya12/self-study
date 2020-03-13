using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Racket : MonoBehaviour {
    void Update() {
        float direction = Input.GetAxisRaw("Horizontal");
        Vector3 force = new Vector3(direction * 2000, 0, 0);
        Rigidbody rbody = this.GetComponent<Rigidbody>();
        rbody.AddForce(force, ForceMode.Impulse);
    }
}
